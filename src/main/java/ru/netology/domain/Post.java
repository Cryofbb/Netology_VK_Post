package ru.netology.domain;

public class Post {
    private int postID;
    private int ownerID;
    private int authorID;
    private int groupID;
    private String postText;
    private boolean canEdit;
    private boolean canDelete;
    private int postDate;
    private boolean postPin;
    private boolean postFavorite;
    private Like like;
    private Reply reply;
    private Comment comment;
    private View view;
    private boolean advertising;
}
