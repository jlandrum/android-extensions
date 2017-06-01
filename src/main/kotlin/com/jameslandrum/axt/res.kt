package com.jameslandrum.axt

import android.content.Context
import android.graphics.drawable.Drawable
import android.support.annotation.ColorRes
import android.support.annotation.DrawableRes
import android.support.annotation.StringRes

/**
 * Methods to get resources from within a context
 * This aids in hiding the "deprecated" aspect (as older APIs require resources access, newer APIs discourage it)
 * As far as I am aware, there is no way to use the new API on older versions of Android.
 */
fun Context.drawable(@DrawableRes id: Int): Drawable? = resources.getDrawable(id)
fun Context.string(@StringRes id: Int): CharSequence? = resources.getString(id)
fun Context.color(@ColorRes id: Int): Int = resources.getColor(id)

/**
 * Methods to create resources using shorthand
 */
fun Context.color(red:Short, green:Short, blue:Short, alpha:Short = 0xFF): Int =
        red.toInt().shl(6) + green.toInt().shl(4) + blue.toInt().shl(2) + alpha
