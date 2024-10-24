package com.oasisfeng.island.presentation.actions

import com.oasisfeng.island.presentation.utils.DateValidatorAllowed

sealed class LogsActions {
  class ShowUsualDialog(val value: DialogActions): LogsActions()
  class ShowDatePicker(val dateValidator: DateValidatorAllowed, val selection: Long): LogsActions()

}
