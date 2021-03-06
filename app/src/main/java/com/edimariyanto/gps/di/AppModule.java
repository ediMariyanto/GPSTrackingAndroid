package com.edimariyanto.gps.di;

import android.app.Application;

import androidx.room.Room;

import com.edimariyanto.gps.db.BarangDao;
import com.edimariyanto.gps.db.BarangDb;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(includes = ViewModelModule.class)
class AppModule {

    // TODO : Change Service class
    // TODO : Singleton class, use OKHTTP3 for TLS/SSL connection


    @Singleton
    @Provides
    BarangDb providerDb(Application application) {
        return Room.databaseBuilder(application, BarangDb.class, "barang.db")
                //.addMigrations(MIGRATION_1_2) : sample migration version
                .build();
    }

    @Singleton
    @Provides
    BarangDao provideBarangDao(BarangDb db) {
        return db.barangDao();
    }

}
