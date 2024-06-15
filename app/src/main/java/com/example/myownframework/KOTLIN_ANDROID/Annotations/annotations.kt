package com.example.myownframework.Kotlin_Android.Annotations

/*https://www.youtube.com/watch?v=qdnhQzVGywQ&ab_channel=PhilippLackner*/

data class  User(
    val name : String,
   @AllowedRegex("\\d{4}-\\d{2}-\\d{2}") val birthDate : String
) {

    init {
        val fields = this::class.java.declaredFields
        fields.forEach { field ->
            field.annotations.forEach { annotation ->
                if (field.isAnnotationPresent(AllowedRegex::class.java)){
                    val regex = field.getAnnotation(AllowedRegex::class.java)?.regex
                    if (regex?.toRegex()?.matches(birthDate) == false){
                        throw IllegalArgumentException("birth date is not a valid date $birthDate")
                    }
                }
            }

        }
    }
}

@Target(AnnotationTarget.FIELD)
@Retention
annotation class AllowedRegex(val regex : String )