package com.jameslandrum.axt

import android.view.View

infix fun View.showIf(condition:Boolean) { this.visibility = if (condition) View.VISIBLE else View.GONE }
infix fun View.hideIf(condition:Boolean) { this.visibility = if (!condition) View.VISIBLE else View.GONE }
