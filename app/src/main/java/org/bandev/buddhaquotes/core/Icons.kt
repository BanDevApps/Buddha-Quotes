/**

Buddha Quotes
Copyright (C) 2021  BanDev

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <https://www.gnu.org/licenses/>.

 */

package org.bandev.buddhaquotes.core

import android.content.Context
import android.graphics.drawable.Icon
import androidx.core.content.ContextCompat
import com.maxkeppeler.sheets.core.IconButton
import com.mikepenz.iconics.IconicsDrawable
import com.mikepenz.iconics.typeface.IIcon
import com.mikepenz.iconics.typeface.library.googlematerial.RoundedGoogleMaterial
import com.mikepenz.iconics.utils.colorInt
import com.mikepenz.iconics.utils.paddingDp
import com.mikepenz.iconics.utils.sizeDp
import org.bandev.buddhaquotes.R


class Icons(var context: Context) {

    private val defaultDp = 24
    private val defaultColorInt = context.resolveColorAttr(android.R.attr.textColorPrimary)

    fun heart(liked: Boolean): IconicsDrawable {
        val colour = if (liked) ContextCompat.getColor(context, R.color.heart) else
            defaultColorInt
        val iicon = if (liked) RoundedGoogleMaterial.Icon.gmr_favorite else
            RoundedGoogleMaterial.Icon.gmr_favorite_outline
        return icon(iicon, colour)
    }

    fun closeSheet(): IconButton {
        val icon = icon(RoundedGoogleMaterial.Icon.gmr_expand_more)
        icon.paddingDp = 6
        return IconButton(icon)
    }

    fun share(): IconicsDrawable = icon(RoundedGoogleMaterial.Icon.gmr_share)
    fun addCircle(): IconicsDrawable = icon(RoundedGoogleMaterial.Icon.gmr_add_circle_outline)

    private fun icon(
        iicon: IIcon,
        _colorInt: Int = defaultColorInt,
        _sizeDp: Int = defaultDp
    ): IconicsDrawable {
        return IconicsDrawable(context, iicon).apply {
            colorInt = _colorInt
            sizeDp = _sizeDp
        }
    }
}
