public static boolean isInstalledApp(Context context, String packageName)
    {
        Boolean flag = false;
 
        try
        {
            PackageManager pm = context.getPackageManager();
            List<packageinfo> pkgs = pm.getInstalledPackages(PackageManager.GET_UNINSTALLED_PACKAGES);
            for (PackageInfo pkg : pkgs)
            {
                // 当找到了名字和该包名相同的时候，返回
                if ((pkg.packageName).equals(packageName))
                {
                    return flag = true;
                }
            }
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
 
        return flag;
    }</packageinfo>
