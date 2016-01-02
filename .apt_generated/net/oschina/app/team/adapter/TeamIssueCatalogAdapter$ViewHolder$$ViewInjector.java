// Generated code from Butter Knife. Do not modify!
package net.oschina.app.team.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class TeamIssueCatalogAdapter$ViewHolder$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.team.adapter.TeamIssueCatalogAdapter.ViewHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362297, "field 'title'");
    target.title = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362299, "field 'description'");
    target.description = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362298, "field 'state'");
    target.state = (android.widget.TextView) view;
  }

  public static void reset(net.oschina.app.team.adapter.TeamIssueCatalogAdapter.ViewHolder target) {
    target.title = null;
    target.description = null;
    target.state = null;
  }
}
