// Generated code from Butter Knife. Do not modify!
package net.oschina.app.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class ExploreFragment$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.fragment.ExploreFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362037, "field 'mScan'");
    target.mScan = view;
    view = finder.findRequiredView(source, 2131362036, "field 'mActivities'");
    target.mActivities = view;
    view = finder.findRequiredView(source, 2131362033, "field 'mRlActive'");
    target.mRlActive = view;
    view = finder.findRequiredView(source, 2131362038, "field 'mShake'");
    target.mShake = view;
    view = finder.findRequiredView(source, 2131362035, "field 'mCity'");
    target.mCity = view;
    view = finder.findRequiredView(source, 2131362034, "field 'mFindOSCer'");
    target.mFindOSCer = view;
  }

  public static void reset(net.oschina.app.fragment.ExploreFragment target) {
    target.mScan = null;
    target.mActivities = null;
    target.mRlActive = null;
    target.mShake = null;
    target.mCity = null;
    target.mFindOSCer = null;
  }
}
