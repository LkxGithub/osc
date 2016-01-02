// Generated code from Butter Knife. Do not modify!
package net.oschina.app.base;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class BaseListFragment$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.base.BaseListFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362004, "field 'mSwipeRefreshLayout'");
    target.mSwipeRefreshLayout = (android.support.v4.widget.SwipeRefreshLayout) view;
    view = finder.findRequiredView(source, 2131361903, "field 'mErrorLayout'");
    target.mErrorLayout = (net.oschina.app.ui.empty.EmptyLayout) view;
    view = finder.findRequiredView(source, 2131362005, "field 'mListView'");
    target.mListView = (android.widget.ListView) view;
  }

  public static void reset(net.oschina.app.base.BaseListFragment target) {
    target.mSwipeRefreshLayout = null;
    target.mErrorLayout = null;
    target.mListView = null;
  }
}
