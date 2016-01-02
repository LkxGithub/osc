// Generated code from Butter Knife. Do not modify!
package net.oschina.app.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MessageAdapter$ViewHolder$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.adapter.MessageAdapter.ViewHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362071, "field 'time'");
    target.time = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362050, "field 'name'");
    target.name = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362269, "field 'sender'");
    target.sender = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362049, "field 'avatar'");
    target.avatar = (net.oschina.app.widget.AvatarView) view;
    view = finder.findRequiredView(source, 2131362234, "field 'content'");
    target.content = (net.oschina.app.widget.TweetTextView) view;
    view = finder.findRequiredView(source, 2131362270, "field 'count'");
    target.count = (android.widget.TextView) view;
  }

  public static void reset(net.oschina.app.adapter.MessageAdapter.ViewHolder target) {
    target.time = null;
    target.name = null;
    target.sender = null;
    target.avatar = null;
    target.content = null;
    target.count = null;
  }
}
