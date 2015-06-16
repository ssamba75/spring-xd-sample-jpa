package org.test.common;

import javax.persistence.*;

/**
 * @author dominik.mengelt@gmail.com
 */
@Entity
@Table(name = "simple_tweet")
public class SimpleTweet {

    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    private String text;

    private SimpleTweet(){}

    public SimpleTweet(String text){
        this.text = text;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SimpleTweet{");
        sb.append("id=").append(id);
        sb.append(", text='").append(text).append('\'');
        sb.append('}');
        return sb.toString();
    }
}