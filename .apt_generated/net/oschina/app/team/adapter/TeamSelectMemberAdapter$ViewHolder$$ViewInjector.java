// Generated code from Butter Knife. Do not modify!
package net.oschina.app.team.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class TeamSelectMemberAdapter$ViewHolder$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.team.adapter.TeamSelectMemberAdapter.ViewHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362050, "field 'name'");
    target.name = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362049, "field 'aView'");
    target.aView = (net.oschina.app.widget.AvatarView) view;
  }

  public static void reset(net.oschina.app.team.adapter.TeamSelectMemberAdapter.ViewHolder target) {
    target.name = null;
    target.aView = null;
  }
}
