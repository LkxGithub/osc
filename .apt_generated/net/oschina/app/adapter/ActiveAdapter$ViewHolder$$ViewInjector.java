// Generated code from Butter Knife. Do not modify!
package net.oschina.app.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class ActiveAdapter$ViewHolder$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.adapter.ActiveAdapter.ViewHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362250, "field 'action'");
    target.action = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362251, "field 'actionName'");
    target.actionName = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131361986, "field 'commentCount'");
    target.commentCount = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362252, "field 'body'");
    target.body = (net.oschina.app.widget.TweetTextView) view;
    view = finder.findRequiredView(source, 2131362049, "field 'avatar'");
    target.avatar = (net.oschina.app.widget.AvatarView) view;
    view = finder.findRequiredView(source, 2131362253, "field 'lyReply'");
    target.lyReply = view;
    view = finder.findRequiredView(source, 2131362235, "field 'pic'");
    target.pic = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131362050, "field 'name'");
    target.name = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362254, "field 'reply'");
    target.reply = (net.oschina.app.widget.TweetTextView) view;
    view = finder.findRequiredView(source, 2131362071, "field 'time'");
    target.time = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362233, "field 'from'");
    target.from = (android.widget.TextView) view;
  }

  public static void reset(net.oschina.app.adapter.ActiveAdapter.ViewHolder target) {
    target.action = null;
    target.actionName = null;
    target.commentCount = null;
    target.body = null;
    target.avatar = null;
    target.lyReply = null;
    target.pic = null;
    target.name = null;
    target.reply = null;
    target.time = null;
    target.from = null;
  }
}
