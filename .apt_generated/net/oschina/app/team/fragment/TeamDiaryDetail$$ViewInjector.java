// Generated code from Butter Knife. Do not modify!
package net.oschina.app.team.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class TeamDiaryDetail$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.team.fragment.TeamDiaryDetail target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361903, "field 'mErrorLayout'");
    target.mErrorLayout = (net.oschina.app.ui.empty.EmptyLayout) view;
    view = finder.findRequiredView(source, 2131362005, "field 'mList'");
    target.mList = (android.widget.ListView) view;
    view = finder.findRequiredView(source, 2131362004, "field 'mSwiperefreshlayout'");
    target.mSwiperefreshlayout = (android.support.v4.widget.SwipeRefreshLayout) view;
  }

  public static void reset(net.oschina.app.team.fragment.TeamDiaryDetail target) {
    target.mErrorLayout = null;
    target.mList = null;
    target.mSwiperefreshlayout = null;
  }
}
