// Generated code from Butter Knife. Do not modify!
package net.oschina.app.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class FindUserFragment$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.fragment.FindUserFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361903, "field 'mErrorLayout'");
    target.mErrorLayout = (net.oschina.app.ui.empty.EmptyLayout) view;
    view = finder.findRequiredView(source, 2131362042, "field 'mListView'");
    target.mListView = (android.widget.ListView) view;
  }

  public static void reset(net.oschina.app.fragment.FindUserFragment target) {
    target.mErrorLayout = null;
    target.mListView = null;
  }
}
