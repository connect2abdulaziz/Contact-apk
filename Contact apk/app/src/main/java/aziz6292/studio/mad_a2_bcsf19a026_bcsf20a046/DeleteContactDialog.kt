package aziz6292.studio.mad_a2_bcsf19a026_bcsf20a046


import android.content.Context
import androidx.appcompat.app.AlertDialog

class DeleteContactDialog(
    context: Context,
    private val onDeleteContact: () -> Unit
) {

    private val dialog = AlertDialog.Builder(context)
        .setTitle("Delete Contact")
        .setMessage("Are you sure you want to delete this contact?")
        .setPositiveButton("Delete") { _, _ ->
            onDeleteContact()
        }
        .setNegativeButton("Cancel", null)
        .create()

    fun show() {
        dialog.show()
    }
}
