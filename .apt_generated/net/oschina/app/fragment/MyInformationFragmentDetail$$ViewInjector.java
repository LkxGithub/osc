// Generated code from Butter Knife. Do not modify!
package net.oschina.app.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MyInformationFragmentDetail$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.fragment.MyInformationFragmentDetail target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361903, "field 'mErrorLayout'");
    target.mErrorLayout = (net.oschina.app.ui.empty.EmptyLayout) view;
    view = finder.findRequiredView(source, 2131362049, "field 'mUserFace'");
    target.mUserFace = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131362217, "field 'mFocus'");
    target.mFocus = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362216, "field 'mPlatFrom'");
    target.mPlatFrom = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362214, "field 'mJoinTime'");
    target.mJoinTime = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362050, "field 'mName'");
    target.mName = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362215, "field 'mFrom'");
    target.mFrom = (android.widget.TextView) view;
  }

  public static void reset(net.oschina.app.fragment.MyInformationFragmentDetail target) {
    target.mErrorLayout = null;
    target.mUserFace = null;
    target.mFocus = null;
    target.mPlatFrom = null;
    target.mJoinTime = null;
    target.mName = null;
    target.mFrom = null;
  }
}
