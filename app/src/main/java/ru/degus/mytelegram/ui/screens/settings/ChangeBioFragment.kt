package ru.degus.mytelegram.ui.screens.settings

import kotlinx.android.synthetic.main.fragment_change_bio.*
import ru.degus.mytelegram.R
import ru.degus.mytelegram.database.*
import ru.degus.mytelegram.ui.screens.base.BaseChangeFragment

class ChangeBioFragment : BaseChangeFragment(R.layout.fragment_change_bio) {
    override fun onResume() {
        super.onResume()
        settings_input_bio.setText(USER.bio)
    }

    override fun change() {
        super.change()
        val newBio = settings_input_bio.text.toString()
        setBioToDataBase(newBio)
    }
}