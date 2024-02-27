package com.example.myownframework.Kotlin_Android.Permissions.java

/*
private boolean isStoragePermissionGranted() {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
        return Environment.isExternalStorageManager();
    } else {
        return ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED;
    }
}

private void requestStoragePermission() {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
        try {
            Intent intent = new Intent(Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION);
            intent.setData(Uri.parse("package:" + getPackageName()));
            startActivityForResult(intent, STORAGE_PERMISSION_REQUEST_CODE);
        } catch (Exception e) {
            // Handle exception if Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION is not available
            e.printStackTrace();
            Toast.makeText(this, "Unable to request permission", Toast.LENGTH_SHORT).show();
        }
    } else {
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, STORAGE_PERMISSION_REQUEST_CODE);
    }
}

@Override
public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    if (requestCode == STORAGE_PERMISSION_REQUEST_CODE) {
        if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            // Permission granted
            // You can perform operations needing storage access here
            Toast.makeText(this, "Storage Permission Granted", Toast.LENGTH_SHORT).show();
        } else {
            // Permission denied
            // You can handle this case accordingly
            Toast.makeText(this, "Storage Permission Denied", Toast.LENGTH_SHORT).show();
        }
    }
}*/
