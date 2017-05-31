package com.jameslandrum.axt

import android.view.View

infix fun View.showIf(condition:Boolean?) { this.visibility = if (condition?:false) View.VISIBLE else View.GONE }
infix fun View.hideIf(condition:Boolean?) { this.visibility = if (!(condition?:false)) View.VISIBLE else View.GONE }
infix fun View.enableIf(condition:Boolean?) { this.isEnabled = condition?:false }
infix fun View.disableIf(condition:Boolean?) { this.isEnabled = !(condition?:false) }