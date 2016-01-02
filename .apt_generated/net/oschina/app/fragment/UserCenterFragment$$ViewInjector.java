// Generated code from Butter Knife. Do not modify!
package net.oschina.app.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class UserCenterFragment$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.fragment.UserCenterFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361903, "field 'mEmptyView'");
    target.mEmptyView = (net.oschina.app.ui.empty.EmptyLayout) view;
    view = finder.findRequiredView(source, 2131362205, "field 'mListView'");
    target.mListView = (android.widget.ListView) view;
  }

  public static void reset(net.oschina.app.fragment.UserCenterFragment target) {
    target.mEmptyView = null;
    target.mListView = null;
  }
}
