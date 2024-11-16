// Check if the Battery Status API is supported by the browser
if ('getBattery' in navigator) {
    // Access the Battery Status API
    navigator.getBattery().then(function(battery) {
        // Function to update battery information on the webpage
        function updateBatteryStatus() {
            const batteryLevel = (battery.level * 100).toFixed(0) + '%'; // Battery level in percentage
            const isCharging = battery.charging ? "Yes" : "No";  // Charging status
            const chargingTime = battery.charging ? "Charging..." : battery.chargingTime === Infinity ? "Unknown" : battery.chargingTime + " seconds";
            const dischargingTime = !battery.charging ? "Discharging..." : battery.dischargingTime === Infinity ? "Unknown" : battery.dischargingTime + " seconds";

            // Update the content dynamically
            document.getElementById('battery-level').textContent = `Battery Level: ${batteryLevel}`;
            document.getElementById('charging-status').textContent = `Charging: ${isCharging}`;
            document.getElementById('charging-time').textContent = `Time to Full: ${chargingTime}`;
            document.getElementById('discharging-time').textContent = `Time to Empty: ${dischargingTime}`;

            // You can also update a visual indicator if you want
            const batteryInfoDiv = document.getElementById('battery-info');
            batteryInfoDiv.innerHTML = `
                <p><strong>Battery Information:</strong></p>
                <p><strong>Level:</strong> ${batteryLevel}</p>
                <p><strong>Charging:</strong> ${isCharging}</p>
                <p><strong>Charging Time:</strong> ${chargingTime}</p>
                <p><strong>Discharging Time:</strong> ${dischargingTime}</p>
            `;
        }

        // Initial battery status update
        updateBatteryStatus();

        // Add event listeners to update the status when battery level or charging state changes
        battery.addEventListener('chargingchange', updateBatteryStatus); // Charging status change
        battery.addEventListener('levelchange', updateBatteryStatus); // Battery level change
        battery.addEventListener('chargingtimechange', updateBatteryStatus); // Time to full change
        battery.addEventListener('dischargingtimechange', updateBatteryStatus); // Time to empty change

    }).catch(function(error) {
        // Handle error if Battery API is not supported or an issue occurs
        console.error("Battery API not supported or error fetching battery data:", error);
        document.getElementById('battery-info').textContent = 'Battery Status API is not supported on this device.';
    });
} else {
    // If the Battery API is not available in the browser
    document.getElementById('battery-info').textContent = 'Battery Status API is not supported by your browser.';
}
