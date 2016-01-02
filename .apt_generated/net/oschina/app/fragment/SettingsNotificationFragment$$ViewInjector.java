// Generated code from Butter Knife. Do not modify!
package net.oschina.app.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class SettingsNotificationFragment$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.fragment.SettingsNotificationFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362098, "field 'mTbAccept'");
    target.mTbAccept = (net.oschina.app.widget.togglebutton.ToggleButton) view;
    view = finder.findRequiredView(source, 2131362102, "field 'mTbVibration'");
    target.mTbVibration = (net.oschina.app.widget.togglebutton.ToggleButton) view;
    view = finder.findRequiredView(source, 2131362103, "field 'mTbAppExit'");
    target.mTbAppExit = (net.oschina.app.widget.togglebutton.ToggleButton) view;
    view = finder.findRequiredView(source, 2131362100, "field 'mTbVoice'");
    target.mTbVoice = (net.oschina.app.widget.togglebutton.ToggleButton) view;
  }

  public static void reset(net.oschina.app.fragment.SettingsNotificationFragment target) {
    target.mTbAccept = null;
    target.mTbVibration = null;
    target.mTbAppExit = null;
    target.mTbVoice = null;
  }
}
