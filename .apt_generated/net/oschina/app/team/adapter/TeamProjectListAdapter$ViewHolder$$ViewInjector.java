// Generated code from Butter Knife. Do not modify!
package net.oschina.app.team.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class TeamProjectListAdapter$ViewHolder$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.team.adapter.TeamProjectListAdapter.ViewHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362300, "field 'source'");
    target.source = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362301, "field 'name'");
    target.name = (android.widget.TextView) view;
  }

  public static void reset(net.oschina.app.team.adapter.TeamProjectListAdapter.ViewHolder target) {
    target.source = null;
    target.name = null;
  }
}
