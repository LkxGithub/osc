// Generated code from Butter Knife. Do not modify!
package net.oschina.app.team.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class TeamMainActivity$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.team.ui.TeamMainActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361903, "field 'mErrorLayout'");
    target.mErrorLayout = (net.oschina.app.ui.empty.EmptyLayout) view;
    view = finder.findRequiredView(source, 2131361904, "field 'container'");
    target.container = view;
  }

  public static void reset(net.oschina.app.team.ui.TeamMainActivity target) {
    target.mErrorLayout = null;
    target.container = null;
  }
}
