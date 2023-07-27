package pjh5365.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pjh5365.board.domain.ArticleComment;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}
