// Generated code from Butter Knife. Do not modify!
package net.oschina.app.team.viewpagefragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class TeamDiaryFragment$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.team.viewpagefragment.TeamDiaryFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362141, "field 'mImgRight'");
    target.mImgRight = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131362142, "field 'mImgCalendar'");
    target.mImgCalendar = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131362139, "field 'mImgLeft'");
    target.mImgLeft = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131362140, "field 'mTvTitle'");
    target.mTvTitle = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362143, "field 'mPager'");
    target.mPager = (android.support.v4.view.ViewPager) view;
  }

  public static void reset(net.oschina.app.team.viewpagefragment.TeamDiaryFragment target) {
    target.mImgRight = null;
    target.mImgCalendar = null;
    target.mImgLeft = null;
    target.mTvTitle = null;
    target.mPager = null;
  }
}
