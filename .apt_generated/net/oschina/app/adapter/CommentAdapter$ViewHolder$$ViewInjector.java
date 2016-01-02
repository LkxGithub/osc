// Generated code from Butter Knife. Do not modify!
package net.oschina.app.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class CommentAdapter$ViewHolder$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.adapter.CommentAdapter.ViewHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362234, "field 'content'");
    target.content = (net.oschina.app.widget.TweetTextView) view;
    view = finder.findRequiredView(source, 2131362049, "field 'avatar'");
    target.avatar = (net.oschina.app.widget.AvatarView) view;
    view = finder.findRequiredView(source, 2131362071, "field 'time'");
    target.time = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362233, "field 'from'");
    target.from = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362257, "field 'relies'");
    target.relies = (android.widget.LinearLayout) view;
    view = finder.findRequiredView(source, 2131362256, "field 'refers'");
    target.refers = (net.oschina.app.widget.FloorView) view;
    view = finder.findRequiredView(source, 2131362050, "field 'name'");
    target.name = (android.widget.TextView) view;
  }

  public static void reset(net.oschina.app.adapter.CommentAdapter.ViewHolder target) {
    target.content = null;
    target.avatar = null;
    target.time = null;
    target.from = null;
    target.relies = null;
    target.refers = null;
    target.name = null;
  }
}
