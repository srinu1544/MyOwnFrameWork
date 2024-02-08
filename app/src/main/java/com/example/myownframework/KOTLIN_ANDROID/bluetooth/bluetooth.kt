package com.example.myownframework.Kotlin_Android.bluetooth

/*


Bluetooth is a wireless technology that allows devices to communicate with each other without
 wires or cables. It uses short-range radio frequency to share data over a short distance.

Android devices can use Bluetooth to wirelessly exchange data with other Bluetooth devices.
Bluetooth can be used to connect some devices to an Android phone without a cord. For example,
Bluetooth can be used to share documents or to connect with other Bluetooth-enabled devices.

To turn off Bluetooth on an Android device, you can:
Open Settings
Locate Bluetooth
Swipe to turn Bluetooth off
Android provides a default Bluetooth stack that supports both Classic Bluetooth and Bluetooth Low Energy



 @SuppressLint("MissingPermission")
    private void showBluetoothDevice(boolean isHistory) {

        try {
            if (mBtAdapter == null) {
                showToast("Bluetooth is not available");
                return;
            }
            if (!mBtAdapter.isEnabled()) {
                Log.i(TAG, "onClick - BT not enabled yet");
                Intent enableIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                startActivityForResult(enableIntent, REQUEST_ENABLE_BT);
            } else {
                Intent newIntent = new Intent(RfidUnload.this, DeviceListActivity.class);
                newIntent.putExtra(SHOW_HISTORY_CONNECTED_LIST, isHistory);
                startActivityForResult(newIntent, REQUEST_SELECT_DEVICE);
                cancelDisconnectTimer();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void connect(String deviceAddress) {
        try {
            if (uhf.getConnectStatus() == ConnectionStatus.CONNECTING) {
                showToast(""+R.string.connecting);
            } else {
                uhf.connect(deviceAddress, btStatus);
            }
        }catch (Exception e){

        }

    }

    public void disconnect(boolean isActiveDisconnect) {
        try {
            cancelDisconnectTimer();
            mIsActiveDisconnect = isActiveDisconnect;
            uhf.disconnect();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
*/