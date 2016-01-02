// Generated code from Butter Knife. Do not modify!
package net.oschina.app.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class AboutOSCFragment$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.fragment.AboutOSCFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361991, "field 'mTvVersionStatus'");
    target.mTvVersionStatus = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131361988, "field 'mTvVersionName'");
    target.mTvVersionName = (android.widget.TextView) view;
  }

  public static void reset(net.oschina.app.fragment.AboutOSCFragment target) {
    target.mTvVersionStatus = null;
    target.mTvVersionName = null;
  }
}
