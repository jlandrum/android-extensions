package com.jameslandrum.axt

import android.view.View

/**
 * Infix function to show or hide views based on the given parameter
 */
infix fun View.showIf(condition:Boolean?) { this.visibility = if (condition?:false) View.VISIBLE else View.GONE }
infix fun View.hideIf(condition:Boolean?) { this.visibility = if (!(condition?:false)) View.VISIBLE else View.GONE }

/**
 * Infix function to show or hide multiple views
 */
infix fun Boolean.shows(views:List<View>) {  views.forEach { if (this) it.visibility = View.VISIBLE } }
infix fun Boolean.hides(views:List<View>) { views.forEach { if (this) it.visibility = View.GONE } }

/**
 * Infix function to enable or disable views based on the given parameter
 */
infix fun View.enableIf(condition:Boolean?) { this.isEnabled = condition?:false }
infix fun View.disableIf(condition:Boolean?) { this.isEnabled = !(condition?:false) }