// Generated code from Butter Knife. Do not modify!
package net.oschina.app.team.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class TeamDiscussAdapter$ViewHolder$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.team.adapter.TeamDiscussAdapter.ViewHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362276, "field 'time'");
    target.time = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131361959, "field 'title'");
    target.title = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362275, "field 'face'");
    target.face = (net.oschina.app.widget.AvatarView) view;
    view = finder.findRequiredView(source, 2131362287, "field 'vote_up'");
    target.vote_up = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362273, "field 'description'");
    target.description = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362144, "field 'author'");
    target.author = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362270, "field 'comment_count'");
    target.comment_count = (android.widget.TextView) view;
  }

  public static void reset(net.oschina.app.team.adapter.TeamDiscussAdapter.ViewHolder target) {
    target.time = null;
    target.title = null;
    target.face = null;
    target.vote_up = null;
    target.description = null;
    target.author = null;
    target.comment_count = null;
  }
}
