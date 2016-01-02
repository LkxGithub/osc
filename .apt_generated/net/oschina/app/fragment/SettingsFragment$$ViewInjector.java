// Generated code from Butter Knife. Do not modify!
package net.oschina.app.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class SettingsFragment$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.fragment.SettingsFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362091, "field 'mTbDoubleClickExit'");
    target.mTbDoubleClickExit = (net.oschina.app.widget.togglebutton.ToggleButton) view;
    view = finder.findRequiredView(source, 2131362086, "field 'mTbLoadImg'");
    target.mTbLoadImg = (net.oschina.app.widget.togglebutton.ToggleButton) view;
    view = finder.findRequiredView(source, 2131362096, "field 'mTvExit'");
    target.mTvExit = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362089, "field 'mTvCacheSize'");
    target.mTvCacheSize = (android.widget.TextView) view;
  }

  public static void reset(net.oschina.app.fragment.SettingsFragment target) {
    target.mTbDoubleClickExit = null;
    target.mTbLoadImg = null;
    target.mTvExit = null;
    target.mTvCacheSize = null;
  }
}
