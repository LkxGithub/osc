// Generated code from Butter Knife. Do not modify!
package net.oschina.app.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MainActivity$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.ui.MainActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 16908306, "field 'mTabHost'");
    target.mTabHost = (net.oschina.app.widget.MyFragmentTabHost) view;
    view = finder.findRequiredView(source, 2131361880, "field 'mAddBt'");
    target.mAddBt = view;
  }

  public static void reset(net.oschina.app.ui.MainActivity target) {
    target.mTabHost = null;
    target.mAddBt = null;
  }
}
