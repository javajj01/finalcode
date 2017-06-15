package com.baizhi.service.impl;

import com.baizhi.dao.CommentMapper;
import com.baizhi.entity.Comment;
import com.baizhi.service.CommentService;
import com.baizhi.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by asus on 2017/6/15.
 */
@Service("commentService")
@Transactional
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    public void add(Comment comment) {
        comment.setId(Utils.getSnowFlake());
        commentMapper.insert(comment);
    }
}
