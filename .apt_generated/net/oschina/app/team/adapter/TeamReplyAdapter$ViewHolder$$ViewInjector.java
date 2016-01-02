// Generated code from Butter Knife. Do not modify!
package net.oschina.app.team.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class TeamReplyAdapter$ViewHolder$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.team.adapter.TeamReplyAdapter.ViewHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362233, "field 'from'");
    target.from = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362050, "field 'name'");
    target.name = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362234, "field 'content'");
    target.content = (net.oschina.app.widget.TweetTextView) view;
    view = finder.findRequiredView(source, 2131362049, "field 'avatar'");
    target.avatar = (net.oschina.app.widget.AvatarView) view;
    view = finder.findRequiredView(source, 2131362071, "field 'time'");
    target.time = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362257, "field 'relies'");
    target.relies = (android.widget.LinearLayout) view;
  }

  public static void reset(net.oschina.app.team.adapter.TeamReplyAdapter.ViewHolder target) {
    target.from = null;
    target.name = null;
    target.content = null;
    target.avatar = null;
    target.time = null;
    target.relies = null;
  }
}
