package net.csdn.modules.persist;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import net.csdn.common.settings.Settings;
import net.csdn.mongo.MongoMongo;

/**
 * BlogInfo: WilliamZhu
 * Date: 12-6-1
 * Time: 下午9:29
 */
public class PersistServiceModule extends AbstractModule {
    private Settings settings;

    public PersistServiceModule(Settings settings) {
        this.settings = settings;
    }

    @Override
    protected void configure() {
        //bind(DataSourceManager.class).asEagerSingleton();
        //bind(MysqlClient.class).in(Singleton.class);
        bind(MongoMongo.class).in(Singleton.class);

    }
}
