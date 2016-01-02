// Generated code from Butter Knife. Do not modify!
package net.oschina.app.team.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class NoteBookFragment$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.team.fragment.NoteBookFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362074, "field 'mImgTrash'");
    target.mImgTrash = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131362073, "field 'mGrid'");
    target.mGrid = (net.oschina.app.widget.KJDragGridView) view;
    view = finder.findRequiredView(source, 2131361903, "field 'mEmptyLayout'");
    target.mEmptyLayout = (net.oschina.app.ui.empty.EmptyLayout) view;
    view = finder.findRequiredView(source, 2131362004, "field 'mSwipeRefreshLayout'");
    target.mSwipeRefreshLayout = (android.support.v4.widget.SwipeRefreshLayout) view;
  }

  public static void reset(net.oschina.app.team.fragment.NoteBookFragment target) {
    target.mImgTrash = null;
    target.mGrid = null;
    target.mEmptyLayout = null;
    target.mSwipeRefreshLayout = null;
  }
}
