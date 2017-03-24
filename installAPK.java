/**
     * 安装.apk文件
     * 
     * @param context
     */
    public void install(Context context, String fileName)
    {
        if (TextUtils.isEmpty(fileName) || context == null)
        {
            return;
        }
        try
        {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setAction(android.content.Intent.ACTION_VIEW);
            intent.setDataAndType(Uri.fromFile(new File(fileName)), "application/vnd.android.package-archive");
            context.startActivity(intent);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
 
    /**
     * 安装.apk文件
     * 
     * @param context
     */
    public void install(Context context, File file)
    {
        try
        {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
            context.startActivity(intent);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
