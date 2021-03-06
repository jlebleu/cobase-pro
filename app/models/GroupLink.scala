package models

/**
 * The group link object.
 *
 * @param id The unique ID of the group.
 * @param title The title of the group.
 * @param count Count of the posts in the group.
 */
case class GroupLink (
  id: Long,
  title: String,
  count: Int
)
