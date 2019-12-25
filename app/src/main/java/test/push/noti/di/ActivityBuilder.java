package test.push.noti.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import test.push.noti.ui.addnew.AddNewUserActivity;
import test.push.noti.ui.addnew.AddNewUserActivityModule;
import test.push.noti.ui.entrance.EntranceActivity;
import test.push.noti.ui.entrance.EntranceActivityModule;
import test.push.noti.ui.msg.*;

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector (modules = EntranceActivityModule.class)
    abstract EntranceActivity bindEntranceActivity();

    @ContributesAndroidInjector (modules = AddNewUserActivityModule.class)
    abstract AddNewUserActivity bindAddNewUserActivity();

    @ContributesAndroidInjector (modules = {
            MessagesActivityModule.class
    })
    abstract MessagesActivity bindMessagesActivity();

    @ContributesAndroidInjector(modules = MessagesFragmentsModule.class)
    abstract MsgAdFragment provideMsgAdFragment();

    @ContributesAndroidInjector(modules = MessagesFragmentsModule.class)
    abstract MsgNoticeFragment provideMsgNoticeFragment();

    @ContributesAndroidInjector(modules = MessagesFragmentsModule.class)
    abstract MsgMessagesFragment provideMsgMessagesFragment();
}
