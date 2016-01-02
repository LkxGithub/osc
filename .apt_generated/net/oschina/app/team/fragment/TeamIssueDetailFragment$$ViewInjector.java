// Generated code from Butter Knife. Do not modify!
package net.oschina.app.team.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class TeamIssueDetailFragment$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.team.fragment.TeamIssueDetailFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362149, "field 'mTvProject'");
    target.mTvProject = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362162, "field 'mTvDieTime'");
    target.mTvDieTime = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131361903, "field 'mErrorLayout'");
    target.mErrorLayout = (net.oschina.app.ui.empty.EmptyLayout) view;
    view = finder.findRequiredView(source, 2131362155, "field 'mTvIssueChild'");
    target.mTvIssueChild = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362152, "field 'mTvTitle'");
    target.mTvTitle = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362147, "field 'mContent'");
    target.mContent = view;
    view = finder.findRequiredView(source, 2131362151, "field 'mTvStateTitle'");
    target.mTvStateTitle = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362148, "field 'mProjectView'");
    target.mProjectView = view;
    view = finder.findRequiredView(source, 2131362170, "field 'mLLlabels'");
    target.mLLlabels = (android.widget.LinearLayout) view;
    view = finder.findRequiredView(source, 2131362168, "field 'mTvState'");
    target.mTvState = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362173, "field 'mTvAttachments'");
    target.mTvAttachments = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362165, "field 'mTvCooperateUser'");
    target.mTvCooperateUser = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362156, "field 'mLLChildIssues'");
    target.mLLChildIssues = (android.widget.LinearLayout) view;
    view = finder.findRequiredView(source, 2131362176, "field 'mTvRelations'");
    target.mTvRelations = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362178, "field 'mLLComments'");
    target.mLLComments = (android.widget.LinearLayout) view;
    view = finder.findRequiredView(source, 2131362159, "field 'mTvToUser'");
    target.mTvToUser = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362150, "method 'onClick'");
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131362166, "method 'onClick'");
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131362153, "method 'onClick'");
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
  }

  public static void reset(net.oschina.app.team.fragment.TeamIssueDetailFragment target) {
    target.mTvProject = null;
    target.mTvDieTime = null;
    target.mErrorLayout = null;
    target.mTvIssueChild = null;
    target.mTvTitle = null;
    target.mContent = null;
    target.mTvStateTitle = null;
    target.mProjectView = null;
    target.mLLlabels = null;
    target.mTvState = null;
    target.mTvAttachments = null;
    target.mTvCooperateUser = null;
    target.mLLChildIssues = null;
    target.mTvRelations = null;
    target.mLLComments = null;
    target.mTvToUser = null;
  }
}
