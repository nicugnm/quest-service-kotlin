package ro.nicolaemariusghergu.quest.domain.user.core.model

data class AddUserCommand(
    var firstName: String,
    var lastName: String,
    var email: String
)