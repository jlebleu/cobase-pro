package models.services

import javax.inject.Inject

import models.{Group, GroupLink}
import models.daos.GroupDAO

/**
 * Handles actions to groups.
 *
 * @param groupDAO The group DAO implementation.
 */
class GroupService @Inject() (groupDAO: GroupDAO) {

  /**
   * Retrieves all groups.
   *
   * @return The retrieved list of groups.
   */
  def findAll(): List[Group] = groupDAO.findAll()

  def findGroupLinks(): List[GroupLink] = groupDAO.findGroupLinks()
  
  /**
   * Retrieves a group that matches the specified id.
   *
   * @param groupId The id to retrieve a group.
   * @return The retrieved group or None if no group could be retrieved for the given id.
   */
  def findById(groupId: Long): Option[Group] = groupDAO.findById(groupId)

  /**
   * Saves a group with given data.
   * *
   * @param group
   * @return Group
   */
  def save(group: Group) = {
    groupDAO.save(group)
  }

  /**
   * Updates a group with given data.
   * *
   * @param group
   * @return Group
   */
  def update(group: Group) = {
    groupDAO.update(group)
  }

}
