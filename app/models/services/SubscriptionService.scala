package models.services

import javax.inject.Inject

import models.{User, Group, Subscription}
import models.daos.SubscriptionDAO

/**
 * Handles actions to subscriptions.
 *
 * @param subscriptionDAO The subscription DAO implementation.
 */
class SubscriptionService @Inject() (subscriptionDAO: SubscriptionDAO) {

  /**
   * Check if given user is subscribed to a given group
   *
   * @param user User
   * @param group Group
   * @return boolean
   */
  def isUserSubscribedToGroup(user: User, group: Group): Boolean = {
    subscriptionDAO.isUserSubscribedToGroup(user, group)
  }

  /**
   * Subscribe user to a group
   *
   * @param user User
   * @param group Group
   */
  def subscribeUserToGroup(user: User, group: Group): Unit = {
    subscriptionDAO.subscribeUserToGroup(user, group)
  }

  /**
   * Unsubscribe user from a group
   *
   * @param user User
   * @param group Group
   */
  def unsubscribeUserFromGroup(user: User, group: Group): Unit = {
    subscriptionDAO.unsubscribeUserFromGroup(user, group)
  }

}
