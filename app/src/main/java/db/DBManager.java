package db;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

public class DBManager {

    public static SQLiteDatabase getdb(Application mApplication) {
        // 初始化，只需要调用一次
        AssetsDatabaseManager.initManager(mApplication);
        // 获取管理对象，因为数据库需要通过管理对象才能够获取
        AssetsDatabaseManager mg = AssetsDatabaseManager.getManager();
        // 通过管理对象获取数据库
        SQLiteDatabase db = mg.getDatabase("china_citys_name.sqlite");
        return db;
    }

}
