package com.example.myownframework.Kotlin_Android.Files

/*private void createFileeee(byte[] responce) {

        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + "/" + File.separator + "NRTPrintPDF.pdf");
            if (file.exists()) {
                try {
                    file.delete();
                    file.createNewFile();
                } catch (Exception e) {
                    Log.d("", "");
                }
            } else {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            try {

                FileOutputStream output = new FileOutputStream(file);
                output.write(responce);
                output.close();

                try {
                    Uri uri = FileProvider.getUriForFile(UnScannedItemsDetils.this, "com.navata.nrt_digital" + ".provider", file);
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setDataAndType(uri, "application/pdf");
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.setFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION
                            | Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
                    startActivity(intent);
                } catch (Exception e) {
                    Log.d("", "");
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

  }*/