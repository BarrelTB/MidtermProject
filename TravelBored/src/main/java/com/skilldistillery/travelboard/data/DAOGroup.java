package com.skilldistillery.travelboard.data;

import java.util.List;

import com.skilldistillery.travelboard.entities.Group;
import com.skilldistillery.travelboard.entities.GroupComment;

public interface DAOGroup {
	
	public Group create(Group group);
	public boolean delete(int groupId);
	public Group update(Group group, int groupId);
	public GroupComment submitComment(GroupComment gComment);
	public boolean deleteComment(int gId);
	public Group getGroupById(int gId);
	public List<GroupComment> getGroupCommentsByGroupId(int gId);

}
