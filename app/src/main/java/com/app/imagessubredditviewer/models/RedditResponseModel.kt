package com.app.imagessubredditviewer.models
import com.squareup.moshi.Json


data class RedditResponseModel(
    @Json(name = "data")
    val data: Data,
    @Json(name = "kind")
    val kind: String // Listing
) {
    data class Data(
        @Json(name = "after")
        val after: String, // t3_hx1pms
        @Json(name = "before")
        val before: Any?, // null
        @Json(name = "children")
        val children: List<Children>,
        @Json(name = "dist")
        val dist: Int, // 25
        @Json(name = "modhash")
        val modhash: String
    ) {
        data class Children(
            @Json(name = "data")
            val `data`: Data,
            @Json(name = "kind")
            val kind: String // t3
        ) {
            data class Data(
                @Json(name = "all_awardings")
                val allAwardings: List<AllAwarding>,
                @Json(name = "allow_live_comments")
                val allowLiveComments: Boolean, // false
                @Json(name = "approved_at_utc")
                val approvedAtUtc: Any?, // null
                @Json(name = "approved_by")
                val approvedBy: Any?, // null
                @Json(name = "archived")
                val archived: Boolean, // false
                @Json(name = "author")
                val author: String, // otterlyhuman
                @Json(name = "author_flair_background_color")
                val authorFlairBackgroundColor: Any?, // null
                @Json(name = "author_flair_css_class")
                val authorFlairCssClass: Any?, // null
                @Json(name = "author_flair_richtext")
                val authorFlairRichtext: List<Any>,
                @Json(name = "author_flair_template_id")
                val authorFlairTemplateId: Any?, // null
                @Json(name = "author_flair_text")
                val authorFlairText: Any?, // null
                @Json(name = "author_flair_text_color")
                val authorFlairTextColor: Any?, // null
                @Json(name = "author_flair_type")
                val authorFlairType: String, // text
                @Json(name = "author_fullname")
                val authorFullname: String, // t2_69ff0yqi
                @Json(name = "author_patreon_flair")
                val authorPatreonFlair: Boolean, // false
                @Json(name = "author_premium")
                val authorPremium: Boolean, // false
                @Json(name = "awarders")
                val awarders: List<Any>,
                @Json(name = "banned_at_utc")
                val bannedAtUtc: Any?, // null
                @Json(name = "banned_by")
                val bannedBy: Any?, // null
                @Json(name = "can_gild")
                val canGild: Boolean, // false
                @Json(name = "can_mod_post")
                val canModPost: Boolean, // false
                @Json(name = "category")
                val category: Any?, // null
                @Json(name = "clicked")
                val clicked: Boolean, // false
                @Json(name = "content_categories")
                val contentCategories: Any?, // null
                @Json(name = "contest_mode")
                val contestMode: Boolean, // false
                @Json(name = "created")
                val created: Int, // 1596942937
                @Json(name = "created_utc")
                val createdUtc: Int, // 1596914137
                @Json(name = "crosspost_parent")
                val crosspostParent: String, // t3_i0uot4
                @Json(name = "crosspost_parent_list")
                val crosspostParentList: List<CrosspostParent>,
                @Json(name = "discussion_type")
                val discussionType: Any?, // null
                @Json(name = "distinguished")
                val distinguished: Any?, // null
                @Json(name = "domain")
                val domain: String, // i.redd.it
                @Json(name = "downs")
                val downs: Int, // 0
                @Json(name = "edited")
                val edited: Boolean, // false
                @Json(name = "gilded")
                val gilded: Int, // 0
                @Json(name = "gildings")
                val gildings: Gildings,
                @Json(name = "hidden")
                val hidden: Boolean, // false
                @Json(name = "hide_score")
                val hideScore: Boolean, // false
                @Json(name = "id")
                val id: String, // i64xw5
                @Json(name = "is_crosspostable")
                val isCrosspostable: Boolean, // false
                @Json(name = "is_meta")
                val isMeta: Boolean, // false
                @Json(name = "is_original_content")
                val isOriginalContent: Boolean, // false
                @Json(name = "is_reddit_media_domain")
                val isRedditMediaDomain: Boolean, // true
                @Json(name = "is_robot_indexable")
                val isRobotIndexable: Boolean, // true
                @Json(name = "is_self")
                val isSelf: Boolean, // false
                @Json(name = "is_video")
                val isVideo: Boolean, // false
                @Json(name = "likes")
                val likes: Any?, // null
                @Json(name = "link_flair_background_color")
                val linkFlairBackgroundColor: String, // #373c3f
                @Json(name = "link_flair_css_class")
                val linkFlairCssClass: String,
                @Json(name = "link_flair_richtext")
                val linkFlairRichtext: List<LinkFlairRichtext>,
                @Json(name = "link_flair_template_id")
                val linkFlairTemplateId: String, // 118a13e8-6cc6-11e8-b9f3-0e20e9364948
                @Json(name = "link_flair_text")
                val linkFlairText: String, // OriginalContent
                @Json(name = "link_flair_text_color")
                val linkFlairTextColor: String, // light
                @Json(name = "link_flair_type")
                val linkFlairType: String, // richtext
                @Json(name = "locked")
                val locked: Boolean, // false
                @Json(name = "media")
                val media: Any?, // null
                @Json(name = "media_embed")
                val mediaEmbed: MediaEmbed,
                @Json(name = "media_only")
                val mediaOnly: Boolean, // false
                @Json(name = "mod_note")
                val modNote: Any?, // null
                @Json(name = "mod_reason_by")
                val modReasonBy: Any?, // null
                @Json(name = "mod_reason_title")
                val modReasonTitle: Any?, // null
                @Json(name = "mod_reports")
                val modReports: List<Any>,
                @Json(name = "name")
                val name: String, // t3_i64xw5
                @Json(name = "no_follow")
                val noFollow: Boolean, // false
                @Json(name = "num_comments")
                val numComments: Int, // 6
                @Json(name = "num_crossposts")
                val numCrossposts: Int, // 0
                @Json(name = "num_reports")
                val numReports: Any?, // null
                @Json(name = "over_18")
                val over18: Boolean, // false
                @Json(name = "parent_whitelist_status")
                val parentWhitelistStatus: String, // all_ads
                @Json(name = "permalink")
                val permalink: String, // /r/Images/comments/i64xw5/spelling_bee/
                @Json(name = "pinned")
                val pinned: Boolean, // false
                @Json(name = "post_hint")
                val postHint: String, // image
                @Json(name = "preview")
                val preview: Preview,
                @Json(name = "pwls")
                val pwls: Int, // 6
                @Json(name = "quarantine")
                val quarantine: Boolean, // false
                @Json(name = "removal_reason")
                val removalReason: Any?, // null
                @Json(name = "removed_by")
                val removedBy: Any?, // null
                @Json(name = "removed_by_category")
                val removedByCategory: Any?, // null
                @Json(name = "report_reasons")
                val reportReasons: Any?, // null
                @Json(name = "saved")
                val saved: Boolean, // false
                @Json(name = "score")
                val score: Int, // 177
                @Json(name = "secure_media")
                val secureMedia: Any?, // null
                @Json(name = "secure_media_embed")
                val secureMediaEmbed: SecureMediaEmbed,
                @Json(name = "selftext")
                val selftext: String,
                @Json(name = "selftext_html")
                val selftextHtml: Any?, // null
                @Json(name = "send_replies")
                val sendReplies: Boolean, // true
                @Json(name = "spoiler")
                val spoiler: Boolean, // false
                @Json(name = "stickied")
                val stickied: Boolean, // false
                @Json(name = "subreddit")
                val subreddit: String, // Images
                @Json(name = "subreddit_id")
                val subredditId: String, // t5_2qtjz
                @Json(name = "subreddit_name_prefixed")
                val subredditNamePrefixed: String, // r/Images
                @Json(name = "subreddit_subscribers")
                val subredditSubscribers: Int, // 77241
                @Json(name = "subreddit_type")
                val subredditType: String, // public
                @Json(name = "suggested_sort")
                val suggestedSort: Any?, // null
                @Json(name = "thumbnail")
                val thumbnail: String, // https://b.thumbs.redditmedia.com/jQb07WuZ-Gf0V-ZeHryRjnNaViEyreBno9jepFmTvhk.jpg
                @Json(name = "thumbnail_height")
                val thumbnailHeight: Int, // 138
                @Json(name = "thumbnail_width")
                val thumbnailWidth: Int, // 140
                @Json(name = "title")
                val title: String, // Spelling Bee
                @Json(name = "top_awarded_type")
                val topAwardedType: Any?, // null
                @Json(name = "total_awards_received")
                val totalAwardsReceived: Int, // 1
                @Json(name = "treatment_tags")
                val treatmentTags: List<Any>,
                @Json(name = "ups")
                val ups: Int, // 177
                @Json(name = "upvote_ratio")
                val upvoteRatio: Double, // 0.95
                @Json(name = "url")
                val url: String, // https://i.redd.it/b9jk52g3wtf51.jpg
                @Json(name = "url_overridden_by_dest")
                val urlOverriddenByDest: String, // https://i.redd.it/b9jk52g3wtf51.jpg
                @Json(name = "user_reports")
                val userReports: List<Any>,
                @Json(name = "view_count")
                val viewCount: Any?, // null
                @Json(name = "visited")
                val visited: Boolean, // false
                @Json(name = "whitelist_status")
                val whitelistStatus: String, // all_ads
                @Json(name = "wls")
                val wls: Int // 6
            ) {
                data class AllAwarding(
                    @Json(name = "award_sub_type")
                    val awardSubType: String, // GLOBAL
                    @Json(name = "award_type")
                    val awardType: String, // global
                    @Json(name = "coin_price")
                    val coinPrice: Int, // 100
                    @Json(name = "coin_reward")
                    val coinReward: Int, // 0
                    @Json(name = "count")
                    val count: Int, // 1
                    @Json(name = "days_of_drip_extension")
                    val daysOfDripExtension: Int, // 0
                    @Json(name = "days_of_premium")
                    val daysOfPremium: Int, // 0
                    @Json(name = "description")
                    val description: String, // Laugh like a supervillain
                    @Json(name = "end_date")
                    val endDate: Any?, // null
                    @Json(name = "giver_coin_reward")
                    val giverCoinReward: Int?, // 0
                    @Json(name = "icon_format")
                    val iconFormat: String?, // PNG
                    @Json(name = "icon_height")
                    val iconHeight: Int, // 2048
                    @Json(name = "icon_url")
                    val iconUrl: String, // https://i.redd.it/award_images/t5_22cerq/43zl6dfcg9e51_EvilCackle.png
                    @Json(name = "icon_width")
                    val iconWidth: Int, // 2048
                    @Json(name = "id")
                    val id: String, // award_483d8e29-bbe5-404e-a09a-c2d7b16c4fff
                    @Json(name = "is_enabled")
                    val isEnabled: Boolean, // true
                    @Json(name = "is_new")
                    val isNew: Boolean, // false
                    @Json(name = "name")
                    val name: String, // Evil Cackle
                    @Json(name = "penny_donate")
                    val pennyDonate: Int?, // 0
                    @Json(name = "penny_price")
                    val pennyPrice: Int?, // 0
                    @Json(name = "resized_icons")
                    val resizedIcons: List<ResizedIcon>,
                    @Json(name = "resized_static_icons")
                    val resizedStaticIcons: List<ResizedStaticIcon>,
                    @Json(name = "start_date")
                    val startDate: Any?, // null
                    @Json(name = "static_icon_height")
                    val staticIconHeight: Int, // 2048
                    @Json(name = "static_icon_url")
                    val staticIconUrl: String, // https://i.redd.it/award_images/t5_22cerq/43zl6dfcg9e51_EvilCackle.png
                    @Json(name = "static_icon_width")
                    val staticIconWidth: Int, // 2048
                    @Json(name = "subreddit_coin_reward")
                    val subredditCoinReward: Int, // 0
                    @Json(name = "subreddit_id")
                    val subredditId: Any? // null
                ) {
                    data class ResizedIcon(
                        @Json(name = "height")
                        val height: Int, // 16
                        @Json(name = "url")
                        val url: String, // https://preview.redd.it/award_images/t5_22cerq/43zl6dfcg9e51_EvilCackle.png?width=16&amp;height=16&amp;auto=webp&amp;s=6aa7f9c1a296f107705396635063074c89d0ae9f
                        @Json(name = "width")
                        val width: Int // 16
                    )

                    data class ResizedStaticIcon(
                        @Json(name = "height")
                        val height: Int, // 16
                        @Json(name = "url")
                        val url: String, // https://preview.redd.it/award_images/t5_22cerq/43zl6dfcg9e51_EvilCackle.png?width=16&amp;height=16&amp;auto=webp&amp;s=6aa7f9c1a296f107705396635063074c89d0ae9f
                        @Json(name = "width")
                        val width: Int // 16
                    )
                }

                data class CrosspostParent(
                    @Json(name = "all_awardings")
                    val allAwardings: List<Any>,
                    @Json(name = "allow_live_comments")
                    val allowLiveComments: Boolean, // false
                    @Json(name = "approved_at_utc")
                    val approvedAtUtc: Any?, // null
                    @Json(name = "approved_by")
                    val approvedBy: Any?, // null
                    @Json(name = "archived")
                    val archived: Boolean, // false
                    @Json(name = "author")
                    val author: String, // CartoonsbyGaspirtz
                    @Json(name = "author_flair_background_color")
                    val authorFlairBackgroundColor: Any?, // null
                    @Json(name = "author_flair_css_class")
                    val authorFlairCssClass: Any?, // null
                    @Json(name = "author_flair_richtext")
                    val authorFlairRichtext: List<Any>,
                    @Json(name = "author_flair_template_id")
                    val authorFlairTemplateId: Any?, // null
                    @Json(name = "author_flair_text")
                    val authorFlairText: Any?, // null
                    @Json(name = "author_flair_text_color")
                    val authorFlairTextColor: Any?, // null
                    @Json(name = "author_flair_type")
                    val authorFlairType: String, // text
                    @Json(name = "author_fullname")
                    val authorFullname: String, // t2_6wb5n8xc
                    @Json(name = "author_patreon_flair")
                    val authorPatreonFlair: Boolean, // false
                    @Json(name = "author_premium")
                    val authorPremium: Boolean, // false
                    @Json(name = "awarders")
                    val awarders: List<Any>,
                    @Json(name = "banned_at_utc")
                    val bannedAtUtc: Any?, // null
                    @Json(name = "banned_by")
                    val bannedBy: Any?, // null
                    @Json(name = "can_gild")
                    val canGild: Boolean, // false
                    @Json(name = "can_mod_post")
                    val canModPost: Boolean, // false
                    @Json(name = "category")
                    val category: Any?, // null
                    @Json(name = "clicked")
                    val clicked: Boolean, // false
                    @Json(name = "content_categories")
                    val contentCategories: Any?, // null
                    @Json(name = "contest_mode")
                    val contestMode: Boolean, // false
                    @Json(name = "created")
                    val created: Int, // 1596173517
                    @Json(name = "created_utc")
                    val createdUtc: Int, // 1596144717
                    @Json(name = "discussion_type")
                    val discussionType: Any?, // null
                    @Json(name = "distinguished")
                    val distinguished: Any?, // null
                    @Json(name = "domain")
                    val domain: String, // i.redd.it
                    @Json(name = "downs")
                    val downs: Int, // 0
                    @Json(name = "edited")
                    val edited: Boolean, // false
                    @Json(name = "gilded")
                    val gilded: Int, // 0
                    @Json(name = "gildings")
                    val gildings: Gildings,
                    @Json(name = "hidden")
                    val hidden: Boolean, // false
                    @Json(name = "hide_score")
                    val hideScore: Boolean, // false
                    @Json(name = "id")
                    val id: String, // i0uot4
                    @Json(name = "is_crosspostable")
                    val isCrosspostable: Boolean, // false
                    @Json(name = "is_meta")
                    val isMeta: Boolean, // false
                    @Json(name = "is_original_content")
                    val isOriginalContent: Boolean, // false
                    @Json(name = "is_reddit_media_domain")
                    val isRedditMediaDomain: Boolean, // true
                    @Json(name = "is_robot_indexable")
                    val isRobotIndexable: Boolean, // true
                    @Json(name = "is_self")
                    val isSelf: Boolean, // false
                    @Json(name = "is_video")
                    val isVideo: Boolean, // false
                    @Json(name = "likes")
                    val likes: Any?, // null
                    @Json(name = "link_flair_background_color")
                    val linkFlairBackgroundColor: String, // #ff66ac
                    @Json(name = "link_flair_css_class")
                    val linkFlairCssClass: String,
                    @Json(name = "link_flair_richtext")
                    val linkFlairRichtext: List<Any>,
                    @Json(name = "link_flair_template_id")
                    val linkFlairTemplateId: String, // 6b4547cc-bb02-11ea-9e47-0eb5b50b5f5f
                    @Json(name = "link_flair_text")
                    val linkFlairText: String, // Pictures
                    @Json(name = "link_flair_text_color")
                    val linkFlairTextColor: String, // dark
                    @Json(name = "link_flair_type")
                    val linkFlairType: String, // text
                    @Json(name = "locked")
                    val locked: Boolean, // false
                    @Json(name = "media")
                    val media: Any?, // null
                    @Json(name = "media_embed")
                    val mediaEmbed: MediaEmbed,
                    @Json(name = "media_only")
                    val mediaOnly: Boolean, // false
                    @Json(name = "mod_note")
                    val modNote: Any?, // null
                    @Json(name = "mod_reason_by")
                    val modReasonBy: Any?, // null
                    @Json(name = "mod_reason_title")
                    val modReasonTitle: Any?, // null
                    @Json(name = "mod_reports")
                    val modReports: List<Any>,
                    @Json(name = "name")
                    val name: String, // t3_i0uot4
                    @Json(name = "no_follow")
                    val noFollow: Boolean, // false
                    @Json(name = "num_comments")
                    val numComments: Int, // 0
                    @Json(name = "num_crossposts")
                    val numCrossposts: Int, // 7
                    @Json(name = "num_reports")
                    val numReports: Any?, // null
                    @Json(name = "over_18")
                    val over18: Boolean, // false
                    @Json(name = "parent_whitelist_status")
                    val parentWhitelistStatus: Any?, // null
                    @Json(name = "permalink")
                    val permalink: String, // /r/Gaspirtz/comments/i0uot4/lockdown_in_los_angeles/
                    @Json(name = "pinned")
                    val pinned: Boolean, // false
                    @Json(name = "post_hint")
                    val postHint: String, // image
                    @Json(name = "preview")
                    val preview: Preview,
                    @Json(name = "pwls")
                    val pwls: Any?, // null
                    @Json(name = "quarantine")
                    val quarantine: Boolean, // false
                    @Json(name = "removal_reason")
                    val removalReason: Any?, // null
                    @Json(name = "removed_by")
                    val removedBy: Any?, // null
                    @Json(name = "removed_by_category")
                    val removedByCategory: Any?, // null
                    @Json(name = "report_reasons")
                    val reportReasons: Any?, // null
                    @Json(name = "saved")
                    val saved: Boolean, // false
                    @Json(name = "score")
                    val score: Int, // 11
                    @Json(name = "secure_media")
                    val secureMedia: Any?, // null
                    @Json(name = "secure_media_embed")
                    val secureMediaEmbed: SecureMediaEmbed,
                    @Json(name = "selftext")
                    val selftext: String,
                    @Json(name = "selftext_html")
                    val selftextHtml: Any?, // null
                    @Json(name = "send_replies")
                    val sendReplies: Boolean, // true
                    @Json(name = "spoiler")
                    val spoiler: Boolean, // false
                    @Json(name = "stickied")
                    val stickied: Boolean, // false
                    @Json(name = "subreddit")
                    val subreddit: String, // Gaspirtz
                    @Json(name = "subreddit_id")
                    val subredditId: String, // t5_2ratos
                    @Json(name = "subreddit_name_prefixed")
                    val subredditNamePrefixed: String, // r/Gaspirtz
                    @Json(name = "subreddit_subscribers")
                    val subredditSubscribers: Int, // 51
                    @Json(name = "subreddit_type")
                    val subredditType: String, // public
                    @Json(name = "suggested_sort")
                    val suggestedSort: Any?, // null
                    @Json(name = "thumbnail")
                    val thumbnail: String, // https://b.thumbs.redditmedia.com/ssdEw9riNBHAawncX5BqlLylUks_FThQ8e80aH8PcCA.jpg
                    @Json(name = "thumbnail_height")
                    val thumbnailHeight: Int, // 140
                    @Json(name = "thumbnail_width")
                    val thumbnailWidth: Int, // 140
                    @Json(name = "title")
                    val title: String, // Lockdown in Los Angeles
                    @Json(name = "top_awarded_type")
                    val topAwardedType: Any?, // null
                    @Json(name = "total_awards_received")
                    val totalAwardsReceived: Int, // 0
                    @Json(name = "treatment_tags")
                    val treatmentTags: List<Any>,
                    @Json(name = "ups")
                    val ups: Int, // 11
                    @Json(name = "upvote_ratio")
                    val upvoteRatio: Double, // 0.92
                    @Json(name = "url")
                    val url: String, // https://i.redd.it/4zi2cv47c2e51.jpg
                    @Json(name = "url_overridden_by_dest")
                    val urlOverriddenByDest: String, // https://i.redd.it/4zi2cv47c2e51.jpg
                    @Json(name = "user_reports")
                    val userReports: List<Any>,
                    @Json(name = "view_count")
                    val viewCount: Any?, // null
                    @Json(name = "visited")
                    val visited: Boolean, // false
                    @Json(name = "whitelist_status")
                    val whitelistStatus: Any?, // null
                    @Json(name = "wls")
                    val wls: Any? // null
                ) {
                    class Gildings(
                    )

                    class MediaEmbed(
                    )

                    data class Preview(
                        @Json(name = "enabled")
                        val enabled: Boolean, // true
                        @Json(name = "images")
                        val images: List<Image>
                    ) {
                        data class Image(
                            @Json(name = "id")
                            val id: String, // tZ1HEPH8ROfRL9aS8Bde6TwkErZKm-TY8JZbTPBtWts
                            @Json(name = "resolutions")
                            val resolutions: List<Resolution>,
                            @Json(name = "source")
                            val source: Source,
                            @Json(name = "variants")
                            val variants: Variants
                        ) {
                            data class Resolution(
                                @Json(name = "height")
                                val height: Int, // 144
                                @Json(name = "url")
                                val url: String, // https://preview.redd.it/4zi2cv47c2e51.jpg?width=108&amp;crop=smart&amp;auto=webp&amp;s=f148b429d42fd6aa069b4e8507638f3f33210e7c
                                @Json(name = "width")
                                val width: Int // 108
                            )

                            data class Source(
                                @Json(name = "height")
                                val height: Int, // 1334
                                @Json(name = "url")
                                val url: String, // https://preview.redd.it/4zi2cv47c2e51.jpg?auto=webp&amp;s=214a6e80adb1906663acb2e5dd08d455603892c1
                                @Json(name = "width")
                                val width: Int // 1000
                            )

                            class Variants(
                            )
                        }
                    }

                    class SecureMediaEmbed(
                    )
                }

                data class Gildings(
                    @Json(name = "gid_2")
                    val gid2: Int // 1
                )

                data class LinkFlairRichtext(
                    @Json(name = "e")
                    val e: String, // text
                    @Json(name = "t")
                    val t: String // OriginalContent
                )

                data class MediaEmbed(
                    @Json(name = "content")
                    val content: String, // &lt;iframe class="embedly-embed" src="https://cdn.embedly.com/widgets/media.html?src=https%3A%2F%2Fimgur.com%2Fa%2FigWymsk%2Fembed%3Fpub%3Dtrue%26ref%3Dhttps%253A%252F%252Fembed.ly%26w%3D900&amp;display_name=Imgur&amp;url=https%3A%2F%2Fimgur.com%2Fa%2FigWymsk&amp;image=https%3A%2F%2Fi.imgur.com%2F9CPSFLg.jpg%3Ffb&amp;key=ed8fa8699ce04833838e66ce79ba05f1&amp;type=text%2Fhtml&amp;schema=imgur" width="600" height="379" scrolling="no" title="Imgur embed" frameborder="0" allow="autoplay; fullscreen" allowfullscreen="true"&gt;&lt;/iframe&gt;
                    @Json(name = "height")
                    val height: Int, // 379
                    @Json(name = "scrolling")
                    val scrolling: Boolean, // false
                    @Json(name = "width")
                    val width: Int // 600
                )

                data class Preview(
                    @Json(name = "enabled")
                    val enabled: Boolean, // true
                    @Json(name = "images")
                    val images: List<Image>
                ) {
                    data class Image(
                        @Json(name = "id")
                        val id: String, // uErnUr7RiHAnq2Bfdr-52049EhqDok9fRuNPvGvrn5U
                        @Json(name = "resolutions")
                        val resolutions: List<Resolution>,
                        @Json(name = "source")
                        val source: Source,
                        @Json(name = "variants")
                        val variants: Variants
                    ) {
                        data class Resolution(
                            @Json(name = "height")
                            val height: Int, // 106
                            @Json(name = "url")
                            val url: String, // https://preview.redd.it/b9jk52g3wtf51.jpg?width=108&amp;crop=smart&amp;auto=webp&amp;s=7e58524b1e0525a3f1cfd74f79692c5c7b4c8caa
                            @Json(name = "width")
                            val width: Int // 108
                        )

                        data class Source(
                            @Json(name = "height")
                            val height: Int, // 2027
                            @Json(name = "url")
                            val url: String, // https://preview.redd.it/b9jk52g3wtf51.jpg?auto=webp&amp;s=8b73352eb1603fd7caa3ee58a50abbe38416de1f
                            @Json(name = "width")
                            val width: Int // 2048
                        )

                        data class Variants(
                            @Json(name = "gif")
                            val gif: Gif,
                            @Json(name = "mp4")
                            val mp4: Mp4
                        ) {
                            data class Gif(
                                @Json(name = "resolutions")
                                val resolutions: List<Resolution>,
                                @Json(name = "source")
                                val source: Source
                            ) {
                                data class Resolution(
                                    @Json(name = "height")
                                    val height: Int, // 108
                                    @Json(name = "url")
                                    val url: String, // https://preview.redd.it/4u14fhxi5vf51.gif?width=108&amp;crop=smart&amp;s=44311fe90e937bf78b1acf36d17ce5e41daa9509
                                    @Json(name = "width")
                                    val width: Int // 108
                                )

                                data class Source(
                                    @Json(name = "height")
                                    val height: Int, // 1200
                                    @Json(name = "url")
                                    val url: String, // https://preview.redd.it/4u14fhxi5vf51.gif?s=0f223a36ecb81891c18ebf620275c1346594013d
                                    @Json(name = "width")
                                    val width: Int // 1200
                                )
                            }

                            data class Mp4(
                                @Json(name = "resolutions")
                                val resolutions: List<Resolution>,
                                @Json(name = "source")
                                val source: Source
                            ) {
                                data class Resolution(
                                    @Json(name = "height")
                                    val height: Int, // 108
                                    @Json(name = "url")
                                    val url: String, // https://preview.redd.it/4u14fhxi5vf51.gif?width=108&amp;format=mp4&amp;s=1516a0016b2c17dd65aa5dc56a1fa73b4416d775
                                    @Json(name = "width")
                                    val width: Int // 108
                                )

                                data class Source(
                                    @Json(name = "height")
                                    val height: Int, // 1200
                                    @Json(name = "url")
                                    val url: String, // https://preview.redd.it/4u14fhxi5vf51.gif?format=mp4&amp;s=685769f00af570664a926fccc223e17cb9eb805f
                                    @Json(name = "width")
                                    val width: Int // 1200
                                )
                            }
                        }
                    }
                }

                data class SecureMediaEmbed(
                    @Json(name = "content")
                    val content: String, // &lt;iframe class="embedly-embed" src="https://cdn.embedly.com/widgets/media.html?src=https%3A%2F%2Fimgur.com%2Fa%2FigWymsk%2Fembed%3Fpub%3Dtrue%26ref%3Dhttps%253A%252F%252Fembed.ly%26w%3D900&amp;display_name=Imgur&amp;url=https%3A%2F%2Fimgur.com%2Fa%2FigWymsk&amp;image=https%3A%2F%2Fi.imgur.com%2F9CPSFLg.jpg%3Ffb&amp;key=ed8fa8699ce04833838e66ce79ba05f1&amp;type=text%2Fhtml&amp;schema=imgur" width="600" height="379" scrolling="no" title="Imgur embed" frameborder="0" allow="autoplay; fullscreen" allowfullscreen="true"&gt;&lt;/iframe&gt;
                    @Json(name = "height")
                    val height: Int, // 379
                    @Json(name = "media_domain_url")
                    val mediaDomainUrl: String, // https://www.redditmedia.com/mediaembed/i3kuns
                    @Json(name = "scrolling")
                    val scrolling: Boolean, // false
                    @Json(name = "width")
                    val width: Int // 600
                )
            }
        }
    }
}