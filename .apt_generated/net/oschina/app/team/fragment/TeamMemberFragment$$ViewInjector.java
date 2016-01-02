// Generated code from Butter Knife. Do not modify!
package net.oschina.app.team.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class TeamMemberFragment$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.team.fragment.TeamMemberFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362179, "field 'mGrid'");
    target.mGrid = (android.widget.GridView) view;
    view = finder.findRequiredView(source, 2131362180, "field 'mEmpty'");
    target.mEmpty = (net.oschina.app.ui.empty.EmptyLayout) view;
    view = finder.findRequiredView(source, 2131362004, "field 'mSwipeRefreshLayout'");
    target.mSwipeRefreshLayout = (android.support.v4.widget.SwipeRefreshLayout) view;
  }

  public static void reset(net.oschina.app.team.fragment.TeamMemberFragment target) {
    target.mGrid = null;
    target.mEmpty = null;
    target.mSwipeRefreshLayout = null;
  }
}
