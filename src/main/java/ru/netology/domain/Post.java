package ru.netology.domain;

public class Post {
    private int postID; // id
    private int ownerID; // owner_id
    private int authorID; // from_id
    private int createdBy;
    private int postDate; // date
    private String postText; // text
    private int replyOwnerID;
    private int replyPostID;
    private boolean friendsOnly;
    private Comment comment; // comments
    private Copyright copyright;
    private Like like;
    private Reply reply;
    private View view;
    private String postType;
    private PostSource postSource;
    private Geo geo;
    private int signtrID;
    private boolean canPin;
    private boolean canEdit; // can_edit
    private boolean canDelete; // can_delete
    private boolean postPin; // is_pinned
    private boolean postFavorite; // is favorite
    private boolean advertising; // marked_as_ads
    private int postponedID;
    private Donut donut;
}
