private static String DEVICEKEY = "";
 
    /**
     * 根据mac地址+deviceid
     * 获取设备唯一编码
     * @return
     */
    public static String getDeviceKey()
    {
        if ("".equals(DEVICEKEY))
        {
            String macAddress = "";
            WifiManager wifiMgr = (WifiManager)MainApplication.getIns().getSystemService(MainApplication.WIFI_SERVICE);
            WifiInfo info = (null == wifiMgr ? null : wifiMgr.getConnectionInfo());
            if (null != info)
            {
                macAddress = info.getMacAddress();
            }
            TelephonyManager telephonyManager =
                (TelephonyManager)MainApplication.getIns().getSystemService(MainApplication.TELEPHONY_SERVICE);
            String deviceId = telephonyManager.getDeviceId();
            DEVICEKEY = MD5Util.toMD5("android" + Constant.APPKEY + Constant.APPPWD + macAddress + deviceId);
        }
        return DEVICEKEY;
    }
