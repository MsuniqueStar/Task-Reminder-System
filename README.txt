Task Reminder System Configuration Testing

Implemented Concrete Features
- Notification Preferences (Concrete)
- Multiple Reminders (Concrete)

Abstract Features
- Task Creation
- Priority Settings
- Due Dates
- Recurring Tasks

Configurations

Basic Student Setup
Command:`java TaskReminderSystem NotificationPreferences`
Expected: Notification Preferences enabled.
Result: Success.

Advanced Student Setup
Command: `java TaskReminderSystem NotificationPreferences MultipleReminders`
Expected: Notification Preferences and Multiple Reminders enabled.
Result: Success.

Faculty Setup
Command: `java TaskReminderSystem NotificationPreferences MultipleReminders`
Expected: Notification Preferences and Multiple Reminders enabled.
Result: Success.

Simple Personal Setup
Command: `java TaskReminderSystem NotificationPreferences`
Expected: Notification Preferences enabled.
Result: Success.

Daily Task Reminder System
Command: `java TaskReminderSystem NotificationPreferences MultipleReminders`
Expected: Notification Preferences and Multiple Reminders enabled.
Result: Success.

Errors Found
- No errors were found during the testing of the five typical configurations.


Detailed Configuration: Daily Task Reminder System

 Features Included:
- Priority Settings
  - Priority Levels (manual)
  - Color Coding (manual)
  - Custom Priority Labels (not selected)
- Task Creation
  - Title Input (manual)
  - Description (manual)
  - Category (manual)
- Due Dates
  - Calendar Picker (manual)
  - Time Selection (manual)
  - Recurring Due Dates (not selected)
  - Deadline Reminders (not selected)
  - Time Zone Support (not selected)
- Reminder Notifications
  - Preferences (manual)
  - Multiple Reminders (manual)
  - Snooze Option (not selected)
- Recurring Tasks
  - Frequency (manual)
  - End Date (manual)
  - Edit Recurrence (not selected)


