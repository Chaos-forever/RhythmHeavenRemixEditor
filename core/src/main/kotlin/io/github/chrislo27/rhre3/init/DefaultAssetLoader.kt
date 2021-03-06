package io.github.chrislo27.rhre3.init

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.assets.loaders.TextureLoader
import com.badlogic.gdx.audio.Music
import com.badlogic.gdx.audio.Sound
import com.badlogic.gdx.graphics.Pixmap
import com.badlogic.gdx.graphics.Texture
import io.github.chrislo27.rhre3.sfxdb.Language
import io.github.chrislo27.rhre3.sfxdb.Series
import io.github.chrislo27.toolboks.lazysound.LazySound
import io.github.chrislo27.toolboks.registry.AssetRegistry


class DefaultAssetLoader : AssetRegistry.IAssetLoader {
    
    override fun addManagedAssets(manager: AssetManager) {
        fun linearTexture(): TextureLoader.TextureParameter = TextureLoader.TextureParameter().apply {
            this.magFilter = Texture.TextureFilter.Linear
            this.minFilter = Texture.TextureFilter.Linear
        }
        
        listOf(16, 24, 32, 64, 128, 256, 512, 1024).forEach {
            AssetRegistry.loadAsset<Texture>("logo_$it", "images/icon/$it.png")
        }
        AssetRegistry.loadAsset<Texture>("logo_rhre2_128", "images/icon/rhre2/128.png")
        
        AssetRegistry.loadAsset<Texture>("sfxdb_missing_icon", "images/gameicon/missing.png", linearTexture())
        (Language.VALUES - Language.UNKNOWN).forEach { lang ->
            AssetRegistry.loadAsset<Pixmap>("sfxdb_langicon_${lang.code}_pixmap", "images/gameicon/lang/${lang.code}.png")
        }
        AssetRegistry.loadAsset<Pixmap>("sfxdb_langicon_${Language.UNKNOWN.code}_pixmap", "images/gameicon/lang/UNKNOWN.png")
        
        Series.VALUES.forEach {
            AssetRegistry.loadAsset<Texture>(it.textureId, it.texturePath)
        }
        AssetRegistry.loadAsset<Texture>("ui_selector_fever", "images/selector/fever.png")
//        AssetRegistry.loadAsset<Texture>("ui_selector_tengoku", "images/selector/tengoku.png")
//        AssetRegistry.loadAsset<Texture>("ui_selector_ds", "images/selector/ds.png")
        AssetRegistry.loadAsset<Texture>("ui_selector", "images/selector/generic.png")
        AssetRegistry.loadAsset<Texture>("ui_selector_favourite", "images/selector/favourite.png")
        
        AssetRegistry.loadAsset<Texture>("tracker_right_tri", "images/ui/tracker_right_triangle.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("tracker_tri", "images/ui/tracker_triangle.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("tracker_right_tri_bordered", "images/ui/tracker_triangle_right_bordered.png", linearTexture())
        
        AssetRegistry.loadAsset<Texture>("tool_selection", "images/tool/selection.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("tool_tempo_change", "images/tool/tempo_change.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("tool_multipart_split", "images/tool/multipart_split.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("tool_time_signature", "images/tool/time_signature.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("tool_music_volume", "images/tool/music_volume.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("tool_swing", "images/tool/swing.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("tool_ruler", "images/tool/ruler.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("tool_pickaxe", "images/tool/pickaxe.png")

//        AssetRegistry.loadAsset<Texture>("entity_stretchable_line", "images/entity/stretchable/line.png")
        AssetRegistry.loadAsset<Texture>("entity_stretchable_arrow", "images/entity/stretchable/arrow.png", linearTexture())
        
        AssetRegistry.loadAsset<Texture>("ui_icon_update", "images/ui/icons/update.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_credits", "images/ui/icons/credits.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_updatesfx", "images/ui/icons/update_sfx.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_palette", "images/ui/icons/palette.png", linearTexture())
//        AssetRegistry.loadAsset<Texture>("ui_icon_info_button", "images/ui/icons/info_button.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_small_gear", "images/ui/icons/small_gear.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_info", "images/ui/icons/info.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_folder", "images/ui/icons/folder.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_resetwindow", "images/ui/icons/reset_window.png")
        AssetRegistry.loadAsset<Texture>("ui_icon_fullscreen", "images/ui/icons/fullscreen.png")
        AssetRegistry.loadAsset<Texture>("ui_icon_warn", "images/ui/icons/warn.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_language", "images/ui/icons/language3.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_metronome", "images/ui/icons/metronome.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_back", "images/ui/icons/back.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_new_button", "images/ui/icons/new_button.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_load_button", "images/ui/icons/load_button.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_save_button", "images/ui/icons/save_button.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_newremix", "images/ui/icons/new_remix.png")
        AssetRegistry.loadAsset<Texture>("ui_icon_saveremix", "images/ui/icons/save_remix.png")
        AssetRegistry.loadAsset<Texture>("ui_icon_songchoose", "images/ui/icons/song_choose.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_music_button", "images/ui/icons/music_button.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_music_button_muted", "images/ui/icons/music_button_muted.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_track_change_button", "images/ui/icons/track_change.png")
        AssetRegistry.loadAsset<Texture>("ui_icon_uncheckedbox", "images/ui/checkbox/unchecked.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_checkedbox", "images/ui/checkbox/checked.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_xcheckedbox", "images/ui/checkbox/x.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_presentation", "images/ui/icons/presentation_mode.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_views", "images/ui/icons/views.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_inspections", "images/ui/icons/inspections.png")
        AssetRegistry.loadAsset<Texture>("ui_icon_inspections_big", "images/ui/icons/inspections_big.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_play", "images/ui/icons/play.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_pause", "images/ui/icons/pause.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_stop", "images/ui/icons/stop.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_export", "images/ui/icons/export.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_export_big", "images/ui/icons/export_big.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_tapalong_button", "images/ui/icons/tapalong_button.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_tab_favourites", "images/ui/icons/favourites_tab.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_tab_custom", "images/ui/icons/custom_tab.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_tab_recents", "images/ui/icons/recents_tab.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_tab_stored_patterns", "images/ui/icons/chest.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_discord", "images/ui/icons/discord_logo_white.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_sfx_volume", "images/ui/icons/sfx_volume.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_scroll_pitch", "images/ui/icons/scroll_pitch.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_right_chevron", "images/ui/icons/right_chevron.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_news", "images/ui/icons/news.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_news_big", "images/ui/icons/news_big.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_news_indicator", "images/ui/icons/news_indicator.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_pattern_store", "images/ui/icons/chest_open.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_pattern_delete", "images/ui/icons/chest_x.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_pencil", "images/ui/icons/pencil.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_x", "images/ui/icons/x.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_donate", "images/ui/donate.png")
//        AssetRegistry.loadAsset<Texture>("ui_icon_bug", "images/ui/icons/bug.png")
        AssetRegistry.loadAsset<Texture>("ui_icon_adv_opts", "images/ui/icons/adv_opts.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_history", "images/ui/icons/history.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_unfullscreen", "images/ui/icons/unfullscreen.png")
        AssetRegistry.loadAsset<Texture>("ui_icon_copy", "images/ui/icons/copy.png")
        AssetRegistry.loadAsset<Texture>("ui_icon_nametag", "images/ui/icons/nametag.png")
        AssetRegistry.loadAsset<Texture>("ui_icon_photo", "images/ui/icons/photo.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_icon_bouncy_road_mania", "images/ui/icons/bouncy_road_mania_32.png")
        AssetRegistry.loadAsset<Texture>("ui_stripe_board", "images/ui/stripe_board.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_breaking", "images/ui/breaking.png")
        AssetRegistry.loadAsset<Texture>("ui_transparent_checkerboard", "images/ui/transparent_checkerboard.png")
        AssetRegistry.loadAsset<Texture>("ui_colour_picker_arrow", "images/ui/colour_picker_arrow.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_speed_change", "images/ui/icons/speed_change.png")
        AssetRegistry.loadAsset<Texture>("ui_textbox", "images/ui/textbox.png")
        AssetRegistry.loadAsset<Texture>("ui_circle", "images/ui/circle.png")
        
        AssetRegistry.loadAsset<Texture>("ui_search_clear", "images/ui/searchbar/clear.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_search_filter_gameName", "images/ui/searchbar/game_name.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_search_filter_entityName", "images/ui/searchbar/entity_name.png")
        AssetRegistry.loadAsset<Texture>("ui_search_filter_callAndResponse", "images/ui/searchbar/call_and_response.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_search_filter_favourites", "images/ui/searchbar/favourites.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_search_filter_useInRemix", "images/ui/searchbar/use_in_remix.png", linearTexture())
        
        AssetRegistry.loadAsset<Texture>("ui_songtitle", "images/ui/song_title.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("ui_loading_icon", "images/loading/rhre3_animation.png")
        AssetRegistry.loadAsset<Texture>("ui_loading_paddler", "images/loading/loading_paddler.png")
        
        AssetRegistry.loadAsset<Texture>("menu_bg_square", "images/menu/bg_square.png")
        AssetRegistry.loadAsset<Texture>("menu_snowflake", "images/menu/snowflake.png", linearTexture())
        
        AssetRegistry.loadAsset<Texture>("weird_wakaaa", "images/etc/wakaaa.png", linearTexture())
        AssetRegistry.loadAsset<Sound>("weird_sfx_honk", "sound/honk.ogg")
        AssetRegistry.loadAsset<Sound>("weird_sfx_bts_c", "sound/c.ogg")
        AssetRegistry.loadAsset<Sound>("weird_sfx_bts_pew", "sound/pew.ogg")
        AssetRegistry.loadAsset<Sound>("etc_sfx_record", "etc/record_click.ogg")
        
        // Menu backgrounds
        AssetRegistry.loadAsset<Texture>("bg_tile", "images/menu/bg_tile.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("bg_polkadot", "images/menu/polkadot.png", linearTexture())
//        AssetRegistry.loadAsset<Texture>("bg_sd_stars", "images/menu/sd_stars.png")
        AssetRegistry.loadAsset<Texture>("bg_sd_starfield", "images/menu/sd_starfield.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("bg_tapTrial", "images/menu/bg_tapTrial.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("bg_launchparty_objects", "images/menu/launchparty.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("bg_btsds_spritesheet", "images/menu/btsds_spritesheet.png")
        
        // play-yan
        AssetRegistry.loadAsset<Texture>("playyan_jumping", "images/playyan/jumping_26.png")
        AssetRegistry.loadAsset<Texture>("playyan_pogo", "images/playyan/pogo.png")
        
        // glee club midi visualization
        AssetRegistry.loadAsset<Texture>("glee_club", "images/chorusmen_rot.png")
        
        // MIDI stuff
        AssetRegistry.loadAsset<Sound>("sfx_sing_loop", "sound/sing_loop.ogg")
        AssetRegistry.loadAsset<Sound>("sfx_cowbell", "sound/cowbell.ogg")
        
        // Playalong
        AssetRegistry.loadAsset<Texture>("playalong_tappoint", "images/playalong/tappoint.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("playalong_perfect", "images/playalong/perfect.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("playalong_perfect_hit", "images/playalong/perfect_hit.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("playalong_perfect_failed", "images/playalong/perfect_failed.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("playalong_flick", "images/playalong/tap_flick.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("playalong_input_timing", "images/playalong/input_timing.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("playalong_heart", "images/playalong/heart.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("playalong_monster_goal", "images/playalong/monster_goal.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("playalong_monster_icon", "images/playalong/monster_icon.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("playalong_hide_input_indicators", "images/playalong/hide_input_indicators.png", linearTexture())
        AssetRegistry.loadAsset<Texture>("playalong_hide_input_indicators_disable", "images/playalong/hide_input_indicators_disable.png", linearTexture())
        AssetRegistry.loadAsset<Sound>("playalong_sfx_monster_fail", "playalong/monster_goal_fail.ogg")
        AssetRegistry.loadAsset<Sound>("playalong_sfx_perfect_fail", "playalong/perfect_fail.ogg")
        AssetRegistry.loadAsset<Sound>("playalong_sfx_monster_ace", "playalong/monster_goal_ace.ogg")
        AssetRegistry.loadAsset<Music>("playalong_settings_input_calibration", "playalong/input_calibration.ogg")
        
        // Extras games
        AssetRegistry.loadAsset<Sound>("sfx_enter_game", "sound/game/enter_game.ogg")
        AssetRegistry.loadAsset<Sound>("sfx_pause_enter", "sound/game/pause/pause_enter.ogg")
        AssetRegistry.loadAsset<Sound>("sfx_pause_exit", "sound/game/pause/pause_exit.ogg")
        AssetRegistry.loadAsset<Sound>("sfx_blip", "sound/game/pause/blip.ogg")
        AssetRegistry.loadAsset<Sound>("sfx_select", "sound/game/pause/select.ogg")
        AssetRegistry.loadAsset<Sound>("sfx_text_advance_1", "sound/game/text_advance_1.ogg")
        AssetRegistry.loadAsset<Sound>("sfx_text_advance_2", "sound/game/text_advance_2.ogg")
    }
    
    override fun addUnmanagedAssets(assets: MutableMap<String, Any>) {
//        listOf(512, 256, 128, 64, 32, 24, 16).forEach {
//            assets[AssetRegistry.bindAsset("rhre3_icon_$it", "images/icon/$it.png").first] = Texture(
//                    "images/icon/$it.png")
//        }
        
        assets["playyan_walking"] = Texture("images/playyan/walking.png")
        
        assets["cursor_horizontal_resize"] =
                Gdx.graphics.newCursor(Pixmap(Gdx.files.internal("images/cursor/horizontal_resize.png")),
                                       16, 8)
        assets["cursor_invisible"] =
                Gdx.graphics.newCursor(Pixmap(Gdx.files.internal("images/cursor/invisible.png")), 1, 1)
    }
    
}